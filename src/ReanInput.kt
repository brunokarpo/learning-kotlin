fun main(args: Array<String>) {

    println("=========================")
    println("->Welcome to our Store!<-")
    println("=========================")

    println("Hello! What can we do for you?")
    var customerResponse = readLine()
    println("Yes, indeed! We have fresh break off the oven! It's your luck day!")
    var secondCustomerResponse = readLine()
    println("You are very welcome! Have a nice day!")


    println("============================")
    println("You conversation with Clerk:")
    println("============================")
    println("Clerk: Hello! What can we do for you?")
    println("Customer: $customerResponse")
    println("Clerk: Yes, indeed! We have fresh break off the oven! It's your luck day!")
    println("Customer: $secondCustomerResponse")
    println("Clerk: You are very welcome! Have a nice day!")

}