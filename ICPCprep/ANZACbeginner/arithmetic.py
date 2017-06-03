two_num =input()
num_pair = two_num.split()
num1 = int(num_pair[0])
num2 = int(num_pair[1])

print(str(num1) + " * " + str(num2) + " = " + str(num1*num2))
if(num2 != 0):
    print(str(num1) + " / " + str(num2) + " = " + str(num1//num2) + " remainder " + str(num1%num2))
else:
    print(str(num1) + " / " + str(num2) + " is an ILLEGAL OPERATION")
