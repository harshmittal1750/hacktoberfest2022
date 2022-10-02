package main

import "fmt"

// Define interface
type hasName interface {
	getName() string
}

func sayHello(hasName hasName) {
	fmt.Println("Hello", hasName.getName())
}

// Define struct
type Animal struct {
	Name string
}

func (animal Animal) getName() string {
	return animal.Name
}

// Function by defalut will pass by value
// hence it will create new memory
// by giving * operator
// it will make a pointer to animal memory
func (animal *Animal) addMr() {
	animal.Name = "Mr. " + animal.Name
}

func main() {
	cat := Animal{Name: "Kucing"}

	// here cat use sayHello method from interface
	// by adding method used in interface
	// cat has implemented interface hasName implicitly
	sayHello(cat)

	cat.addMr()
	fmt.Println(cat.Name)
}
