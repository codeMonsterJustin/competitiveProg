import sys
word = input()
mirrored= ""
letter =''
i = len(word)-1
while(i >= 0):
    if word[i] not in "iovwxbdpq":
        sys.exit("INVALID")
    elif word[i] == 'b':
        letter = 'd'
    elif word[i] == 'd':
        letter = 'b'
    elif word[i] == 'p':
        letter = 'q'
    elif word[i] == 'q':
        letter = 'p'
    else:
        letter = word[i]
    mirrored = mirrored + letter
    i = i -1

print(mirrored)
