package aquarium

class Aquarium(var width: Int = 20,
               var height: Int = 40,
               var length: Int = 100){


    var volume: Int
        get() = width * height * length /1000
        set(value) {height = (value *1000)/(width*length)}

    var water = volume * 0.9

    constructor(numberOfFish: Int): this(){

        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water *0.1
        height = (tank /(length * width)).toInt()
    }
}
