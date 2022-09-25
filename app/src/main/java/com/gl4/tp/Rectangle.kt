package com.gl4.tp

import java.lang.Math.abs

class Rectangle (var p: Point = Point(0,0) , var q : Point = Point(1,1)) {

    constructor(): this( Point(0,0) , q = Point(1,1) )

    override fun toString() =  "p=$p q=$q"

    fun surface () = abs(p.x - q.x) * abs(p.x - q.x)

}