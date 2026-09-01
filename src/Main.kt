//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*val myTemp = Temperature(Temperature.Unit.K)

    myTemp.setTemp(32.0)

    println("The temperature is ${myTemp.getTemp(Temperature.Unit.F)}")*/

    // Zipporah Mooney, OOP Activity

    val myTemp: Temperature = Fahrenheit (0.0)

    myTemp.setTemp(0.0)

    println("The temperature is ${myTemp.getTempIn(Temperature.Unit.C)}")

    myTemp.setTemp(60.0)

    println("The temperature is ${myTemp.getTempIn(Temperature.Unit.F)}")
}