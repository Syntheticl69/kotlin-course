package org.mikhnyukartemm.kotlincourse.lesson19.livecoding19

open class GameConsole() {
    fun startGame(name: String) {
        initHardware()
        loadGame(name)
    }

   protected open fun initHardware() {

    }

    private fun loadGame(name: String) {

    }

}

class PlayStation : GameConsole() {
    fun initHarware() {
        super.initHardware()

    }
}
