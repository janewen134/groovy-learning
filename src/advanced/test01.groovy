package advanced
//
// string
def name = 'will'
age = 19

println name + ":" + age

assert age == 19
//
str1 = 'haha'
str2 = "ha${str1}"
str3 = '''name:123
age:22
gender:male'''
println str1
println str2
println str3
//
// list
def list = ['123', '456']
list.add('hhh')
list<<'wow'
println(list)

// map
def map = ['username':'admin', 'age':21]
map.put('email', '123@gmail.com')
map.gender = 'male'
println map
