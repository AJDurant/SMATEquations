a = 1
b = 1
c = 1
d = 1

x = seq(0, 25)

FirstOrder <- function(a, b, x){
  return  (a * x + b) ;
}


SecondOrder <- function(a,b,c){
  return (a * x * x + b * x + c);
}

Sinus <- function(a, b, c, d, x){
  return (a * sin(b * x ^ c) +d)
}

Fraction <- function(a, b, x){
  return (a / (x + b));
}

plot(x, FirstOrder(a, b, x), type = 'l', lwd = 2, main = "Fist Order Plot")

plot(x, SecondOrder(a, b, x), type = 'l', lwd = 2, main = "Second Order")

plot(x, Sinus(a,b,c,d,x), type = 'l', lwd = 2, main = "Sinus")

plot(x, Fraction(a,b,x), type = 'l', lwd = 2, main = "Fraction")
