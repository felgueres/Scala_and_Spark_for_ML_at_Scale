// Some Testing Questions
// 1.) Check for Single Even:
// Write a function that takes in an integer and returns a Boolean indicating whether or not it is even. See if you can write this in one line!
def isEven(num:Int): Boolean = {
  return num % 2 == 0
}

// isEven(5)

// 2. Check for Evens in a List:
// Check if there is an even number inside list, return Boolean.

def inEven(li:List[Int]): Boolean = {
  for(item <-li){
    if(item %5 == 0){return true}
  }
  return false
}

// 3. Lucky number 7. Take a list of integers and calculate their sum. However, sevens are lucky and they should be counted twice, meaning their value is 14 for the sum. Assume the list isn't empty.
def countSevens(li:List[Int]): Int = {
  var sevencount = 0
  for (i <-li){
    if(i == 7){
      sevencount += 1
    }
  }
  return sevencount
}

def luckySeven(li:List[Int]): Int = {
    val extra: Int = countSevens(li) * 7
    return li.sum + extra
}

// Inline variation
def luckierSeven(li:List[Int]): Int = {
  var count = 0
  for (i <-li){
    if(i==7){
      count += 7
    }
    count +=i
  }
  return count
}

// Can you Balance? : Given a non-empty list of integers, return true if there is a place to split the list so that the sum of the numbers on one side is equal to the sum of the numbers on the other side. For example,
// given the list(1,5,3,3) would return true, you can split it in the middle. Another example (7,3,4) would return true 3+4 =7. Remember you just need to return the boolean, not the split index point.

def isBalance(li:List[Int]): Boolean = {
    var x:Int = li.length + 1
    var counter = 0
    while (counter < x){
      if((li slice (0, counter+1)).sum == li.drop(counter+1).sum){
        return true
      }
      counter += 1
    }
    return false
}

// Palindrome: Given a string, return if Palindrome.

def isPalindrome(s:String): Boolean = {
  return (s.reverse == s)
}
