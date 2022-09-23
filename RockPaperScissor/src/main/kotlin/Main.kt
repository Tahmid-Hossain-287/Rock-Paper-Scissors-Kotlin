// computer chooses option
// user chooses option
// is option invalid, user chooses option again
// compare computer option and user option
// declare win, loose or draw
fun computerChoice(): String {
    val options = arrayOf("Rock", "Paper", "Scissor")
    val computerChoosed = options.random()
    return computerChoosed
}

fun humanChoice(): String {
    val options = arrayOf("1", "2", "3")
    var humanChoosed = "Yet to be defined"
    while (true) {
        println("Choose any one of the following numbers: \n 1 = Rock \n 2 = Paper \n 3 = Scissor \n")
        humanChoosed = readLine()!!.toString()
        if (humanChoosed in options) {
            break
        }
        else {
            println("Invalid input. Please choose again.")
            continue
        }
    }

    if (humanChoosed == "1") {
        humanChoosed = "Rock"
    }
    else if (humanChoosed == "2") {
        humanChoosed = "Paper"
    }
    else if (humanChoosed == "3") {
        humanChoosed = "Scissor"
    }
    return humanChoosed
}

fun compareChoices(humanChoice: String, computerChoice: String) {
    if (humanChoice == "Rock" ) {
        if (computerChoice == "Scissor") {
            println("Computer chose Scissor. \nYou've won!")
        }
        else if (computerChoice == "Paper") {
            println("Computer chose Paper. \nYou've lost!")
        }
        else if (computerChoice == "Rock") {
            println("Computer chose Rock. \nIt's a draw!")
        }
    }
    else if (humanChoice == "Paper") {
        if (computerChoice == "Rock") {
            println("Computer chose Rock. \nYou've won!")
        }
        else if (computerChoice == "Paper") {
            println("Computer chose Paper. \nIt's a draw!")
        }
        else if (computerChoice == "Scissor") {
            println("Computer chose Scissor. \nYou've lost!")
        }
    }
    else if (humanChoice == "Scissor") {
        if (computerChoice == "Scissor") {
            println("Computer chose Scissor. \nIt's a draw!")
        } else if (computerChoice == "Paper") {
            println("Computer chose Paper. \nYou've won!")
        } else if (computerChoice == "Rock") {
            println("Computer chose Rock. \nYou've lost!")
        }
    }
    return
}

fun main(args: Array<String>) {
    compareChoices(humanChoice = humanChoice(), computerChoice = computerChoice())
}

