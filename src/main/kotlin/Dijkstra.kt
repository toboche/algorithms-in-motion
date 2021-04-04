/**
 * Dijkstra algorithm steps:
 * 1. Find cheapest node
 * 2. Update the costs of neighbors of this node
 * 3. Repeat until done for every node in the graph
 * 4. Calculate final path
 *
 * Steps the code follows:
 * while (there are some nodes to process)
 *      grab the node that is closes to the start
 *      if the cost to a neighbor improves
 *          update cost in the neighbor to current cost + cost to neighbor
 *          update the parent of the neighbor to current
 *       mark node as processed
 *  find the cheapest path by following parents of the current node,
 * starting at finish
 **/
class Dijkstra {
    fun find(
        graph: Map<String, Map<String, Int>>,
        start: String,
        finish: String
    ): Array<String> {
        val costs = graph.keys.map {
            it to
                    if (it == "start") {
                        0
                    } else {
                        Int.MAX_VALUE
                    }
        }
            .toMap()
            .toMutableMap()
        val parents = graph.keys
            .map<String, Pair<String, String?>> { it to null }
            .toMap()
            .toMutableMap()

        val processed = mutableSetOf<String>()
        var nodeId = findLowestCostNodeNotProcessed(costs, processed)
        while (nodeId != null) {
            val node = graph.getValue(nodeId)
            processed.add(nodeId)

            node.forEach { (adjacentNode, cost) ->
                val costToGetHere = cost + costs.getValue(nodeId!!)
                if (costs.getValue(adjacentNode) > costToGetHere) {
                    costs[adjacentNode] = costToGetHere
                    parents[adjacentNode] = nodeId
                }
            }
            nodeId = findLowestCostNodeNotProcessed(costs, processed)
        }
        val cheapestPath = mutableListOf<String>()
        var current = finish
        while (current != start) {
            cheapestPath.add(current)
            current = parents.getValue(current)!!
        }
        cheapestPath.add(start)
        return cheapestPath
            .reversed()
            .toTypedArray()
    }

    private fun findLowestCostNodeNotProcessed(costs: MutableMap<String, Int>, processed: MutableSet<String>): String? {
        return costs.filterNot { it.key in processed }
            .maxByOrNull { it.value }?.key
    }
}