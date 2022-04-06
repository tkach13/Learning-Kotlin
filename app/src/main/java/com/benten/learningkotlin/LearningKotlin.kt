package com.benten.learningkotlin


fun main() {
    println(maxSubArray(intArrayOf(5,4,-1,7,8)))
}

fun maxSubArray(numbers: IntArray): Int {

    var maxSumOfSubArray = numbers[0]

    var currentSum = 0

    for (number in numbers) {
        currentSum = maxOf(number, currentSum + number)
        maxSumOfSubArray = maxOf(maxSumOfSubArray, currentSum)
    }

    return maxSumOfSubArray
}

data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun push(value: T) {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        } else {
            return head.toString()
        }
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 == null) {
        return null
    }
    if (l1 == null) {
        return l2
    }
    if (l2 == null) {
        return l1
    }
    if (l1.`val` < l2.`val`) {
        l1.next = mergeTwoLists(l1.next, l2)
        return l1
    }
    l2.next = mergeTwoLists(l2.next, l1)
    return l2
}


open class Guitar(private val simebisRaodenoba: Int) {
    fun adjustStrings() {
        println("THATSIT adjusted $simebisRaodenoba strings")
    }
}

interface PlayMusic {
    fun playMusic()
}

class AcousticGuitar(private val simebisRaodenobaa: Int) : Guitar(simebisRaodenobaa), PlayMusic {
    override fun playMusic() {
        println("dan dandaan daan dan")
    }
}

class ElectricGuitar(private val simebisRaodenobaa: Int) : Guitar(simebisRaodenobaa), PlayMusic {
    override fun playMusic() {
        println("Staaaarwaaaaay to HELLLL , dshm dsshm")
    }
}





