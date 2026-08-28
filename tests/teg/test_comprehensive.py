x = 100
y = 50
z = 25

result = x + y * z
print(result)

power_result = 2 ** 10
print(power_result)

complex_expr = (x + y) * (z - 5) / 4
print(complex_expr)

if x > y:
    print(1)
    if y > z:
        print(2)
        if z > 10:
            print(3)
        else:
            print(4)
    else:
        print(5)
else:
    print(6)

score = 85
if score >= 90:
    grade = 1
elif score >= 80:
    grade = 2
elif score >= 70:
    grade = 3
elif score >= 60:
    grade = 4
else:
    grade = 5
print(grade)

a = 10
b = 20
c = 30
if a < b and b < c:
    print(111)
else:
    print(222)

if a > 5 or c < 10:
    print(333)
else:
    print(444)

if not a > 100:
    print(555)
else:
    print(666)

n = 5
factorial = 1
if n >= 1:
    factorial = factorial * 1
if n >= 2:
    factorial = factorial * 2
if n >= 3:
    factorial = factorial * 3
if n >= 4:
    factorial = factorial * 4
if n >= 5:
    factorial = factorial * 5
print(factorial)

base = 2
exp = 8
power = base ** exp
print(power)

temp = 25
if temp > 30:
    status = 1
elif temp > 20:
    status = 2
elif temp > 10:
    status = 3
else:
    status = 4
print(status)

val = 42
if val == 42:
    print(1000)
if val != 100:
    print(2000)
if val <= 50:
    print(3000)
if val >= 40:
    print(4000)

final_result = (10 + 20) * 3 - 50 / 2 + 2 ** 3
print(final_result)
