val statesNeeded = setOf("mt", "wa", "or", "id", "nv", "ut", "ca", "az")

val stations = mapOf(
    "kone" to setOf("id", "nv", "ut"),
    "ktwo" to setOf("wa", "id", "mt"),
    "kthree" to setOf("or", "nv", "ca"),
    "kfour" to setOf("nv", "ut"),
    "kfive" to setOf("ca", "az")
)

val statesLeft = statesNeeded.toMutableSet()
val stationsLeft = stations.toMutableMap()
val addedStations = mutableListOf<String>()
while (stationsLeft.isNotEmpty() && statesLeft.isNotEmpty()) {
    val stationIdsToServedStations = stationsLeft.map { it.key to it.value.filter { it in statesLeft } }

    val chosenStation = stationIdsToServedStations.maxByOrNull { it.second.size } ?: break

    addedStations.add(chosenStation.first)
    stationsLeft.remove(chosenStation.first)
    statesLeft.removeAll(chosenStation.second)
}

print(addedStations)
