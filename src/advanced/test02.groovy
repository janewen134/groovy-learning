package advanced

def method1 (Closure clo) {
    clo()
    //clo.call()
}
method1 {{
    println 'hahaha'
}}

def method2 (closure) {
//    closure('jane')
     closure.call('jane')
}

method2({
    val->println "my name is ${val}"
})
