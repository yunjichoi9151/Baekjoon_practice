word = input().upper()
arrange_word = list(set(word))
count_alphabet = [word.count(i) for i in arrange_word]
 
if count_alphabet.count(max(count_alphabet)) > 1:
    print('?')
else:
    print(arrange_word[count_alphabet.index(max(count_alphabet))])
