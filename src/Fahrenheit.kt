class Fahrenheit (temp: Double): Temperature (Temperature.Unit.F, temp = temp) {
    override fun getTemp(): Double {
        return super.getTemp(unit)
    }

    override fun getTempIn(unit: Unit): Double {
        return super.getTemp(unit)
    }
}