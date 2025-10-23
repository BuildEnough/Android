# Android(코틀린)

## 변수 선언
`val`, `var`

### val
초기값이 할당되면 바꿀 수 없는 변수

### var
초기값이 할당된 후에도 값을 바꿀 수 있는 변수

```kotlin
val data1 = 10
var data2 = 10


fun main() {
//    data1 = 20 //오류
    data2 = 20
}
```

## 타입
`콜론(:)`을 추가해 타입 명시  
타입 유추 가능시 `콜론(:)` 생략 가능
```kotlin
val data1: Int = 10
val data2 = 20
```

### Unit
반환문이 없는 함수  
함수에서 반환문이 없음을 명시적으로 나타낼 때 `Unit`함수 사용  
보통 생략함
```kotlin
fun printHello(): Unit {
    println("Hello")
}

fun main() {
    printHello()
}
```

### null 허용/불허용
변수 선언 시 `null`을 대입할 수 있는 변수인지, 아닌지를 구분해서 선언해야 함  
타입 뒤에 `?`를 추가하면 `null` 선언 허용, 아니면 불허용
```kotlin
var data1: Int = 10
var data2: Int? = 10

fun main() {
//    data1 = null // 오류
    data2 = null
}
```

## 함수 선언
`fun` 키워드 사용
```kotlin
fun some(data1: Int): Int {
    return data1 * 10
}

fun main() {
    print(some(10))
}
//100
```

## 조건문
### if
```kotlin
fun main() {
    var data = 10
    if (data > 10) {
        println("data > 10")
    } else if (data > 0 && data <= 10) {
        println("data > 0 && data <= 10")
    } else {
        println("data <= 0")
    }
}
//data > 0 && data <= 10
```

### when
```kotlin
fun main() {
    var data = 10

    when (data) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }
}
//data is 10
```

```kotlin
fun main() {
    var data: Any = 10
    when (data) {
        is String -> println("data is String")
        20, 30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10")
        else -> println("data is not valid")
    }
}
//data is 1..10
```

## 반복문
### for
```kotlin
fun main() {
    var sum: Int = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)
}
//55
```
```kotlin
fun main() {
    var sum: Int = 0
    for (i in 1 until 10) {
        sum += i
    }
    println(sum)
}
//45
```
```kotlin
fun main() {
    var sum: Int = 0
    for (i in 2..10 step 2) {
        sum += i
    }
    println(sum)
}
//30
```
```kotlin
fun main() {
    var sum: Int = 0
    for (i in 10 downTo 1) {
        print(i)
        print(" ")
        sum += i
    }
    println(sum)
}
//10 9 8 7 6 5 4 3 2 1 55
```
```kotlin
fun main() {
    var data = arrayOf< Int>(10, 20, 30)
    for (i in data.indices) {
        print(data[i])
        if (i !== data.size-1) {
            print(",")
        }
    }
}
//10,20,30
```
```kotlin
fun main() {
    var data = arrayOf< Int>(10, 20, 30)
    for ((index, value) in data.withIndex()) {
        print(value)
        if(index !== data.size-1) {
            print(",")
        }
    }
}
//10,20,30
```

### while
```kotlin
fun main(args: Array<String>) {
    var x = 0
    var sum1 = 0
    while (x < 10) {
        sum1 += ++x
    }
    println(sum1)
}
//55
```