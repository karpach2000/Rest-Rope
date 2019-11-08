package com.example.rest_rope.back

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.pow

class JumpData {

    class TimePoint
    {
        val time = Date()
        val xAcceleration = 0.0
        val yAcceleration = 0.0
        val zAcceleration = 0.0

        fun getAcceleration() = Math.sqrt(xAcceleration.pow(2) +
                yAcceleration.pow(2) +
                zAcceleration.pow(2) )


        fun toCsvLine() = "${time.time};$xAcceleration;$yAcceleration;$zAcceleration\n"


    }

    val points = ArrayList<TimePoint>()

    fun toCsv(): String
    {
        var csv = "time;xAcceleration;yAcceleration;zAcceleration\n"
        points.forEach { csv  = csv + it.toCsvLine()}
        return csv

    }


}