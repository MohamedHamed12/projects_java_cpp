import random


playername = input("What is your name? ") 
print("welcome  ", playername)
 
  
  
words = ['java', 'computer', 'science', 'programming',
         'python', 'mathematics', 'player', 'hakerrank',
         'codeforces', 'leetcode', 'board', 'games'] 


randword = random.choice(words) 

print("Guess the word")

guesses = ''
turns = 12 

while turns > 0:     
    failed = 0  
    
    for char in randword:
        if char in guesses:
            print(char, end=" ")  
            
        else:
            print("_")
            print(char, end=" ")
            failed += 1   
            
            
    if failed == 0:    
        print("You Win")
        print("The word is: ", randword)
        break
        
        
    print()
    guesschar = input("guess one or more than char:")   
    guesses += guesschar
    
    if guesschar not in randword:   
      
        turns -= 1
        print("Wrong")
        print("You have", + turns, 'more time')
        
        if turns == 0:
            print("You Loose")
