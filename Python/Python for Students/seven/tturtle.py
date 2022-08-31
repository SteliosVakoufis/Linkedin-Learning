from random import randrange
import turtle

BACKGROUND_COLOR = "#0a826e"
CRUST_COLOR = "#d1821b"
SAUCE_COLOR = "#821304"
CHEESE_COLOR = "#d1a63b"
PEPERONI_AMOUNT = 14
PIZZA_CUTS = 10

def createPizza(loc, size, tt):
    tt.pensize(0)
    resetTurtle(loc, tt)

    cSize = size
    sSize = size * 0.88
    chSize = size * 0.85
    pRange = int(chSize * 0.7)

    createCircles(loc, cSize, CRUST_COLOR, tt)
    createCircles(loc, sSize, SAUCE_COLOR, tt)
    createCircles(loc, chSize, CHEESE_COLOR, tt)
    
    for i in range(0, PEPERONI_AMOUNT):
        randomLoc = [randrange(-pRange, pRange) + loc[0], randrange(-pRange, pRange) + loc[1]]
        createCircles(randomLoc, size * 0.1, SAUCE_COLOR, tt)

    createRadialLines(loc, size, PIZZA_CUTS, BACKGROUND_COLOR, tt)


def resetTurtle(loc, tt):
    tt.penup()
    tt.setposition(loc[0], loc[1])
    tt.pendown()


def createRadialLines(loc, size, cuts, col, tt):
    resetTurtle(loc, tt)

    degrees = int(360 / cuts)
    tt.color(col)
    tt.pensize(size * 0.01)
    for i in range(0, cuts):
        tt.forward(size)
        tt.backward(size)
        tt.left(degrees)

def createCircles(loc, size, col, tt):
    
    resetTurtle(loc, tt)

    tt.fillcolor(col)
    tt.begin_fill()

    tt.penup()
    tt.setheading(270)
    tt.forward(size)
    tt.left(90)
    tt.pendown()
    tt.circle(size)
    
    tt.end_fill()

def resetPosition(tt):
    tt.penup()
    tt.setposition(0, 0)
    tt.pendown()
    tt.setheading(0)

#MAIN PROGRAM

window = turtle.Screen()
window.bgcolor(0.3, 0.4, 0.1)
window.title("Insane Pizza Drawer")

t = turtle.Turtle()
t.speed(33)
t.shape("circle")
t.shapesize(1)


for i in range(0, 10):
    pizzaLocation = [randrange(-300, 300), randrange(-300, 300)]
    pizzaSize = randrange(255, 350)
    createPizza(pizzaLocation, pizzaSize, t)

t.hideturtle()
turtle.done()
