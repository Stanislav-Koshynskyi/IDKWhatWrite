s = str(input())
s = s.lower()

filtered_text = ''.join([char for char in s if (char.isalpha() or char.isdigit())])

print ("YES" if (filtered_text == filtered_text[::-1]) else "NO")
