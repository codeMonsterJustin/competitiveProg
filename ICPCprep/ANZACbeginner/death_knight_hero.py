battle_num = int(input())
count = 0
won =0
while(count < battle_num):
    battle = input()
    if(not ("CD" in battle)):
        won = won + 1
    count = count + 1

print(won)
