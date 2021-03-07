package com.knoldus

object MainClassObj {
    def main(args: Array[String]): Unit = {
        val list = args.toList
        val obj = new Cliparser
        obj.driver_Func(list)
    }
}
