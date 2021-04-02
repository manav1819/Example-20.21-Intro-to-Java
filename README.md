# Example-20.21-Intro-to-Java
Generic Sorting of Geometric Objects

Chapter 20 Lists, Stacks, Queues, and Priority Queues

Q. 20.21 (Use Comparator) Write the following generic method using selection sort
and a comparator.
public static <E> void selectionSort(E[] list,
Comparator<? super E> comparator)
Write a test program that creates an array of 10 GeometricObjects and
invokes this method using the GeometricObjectComparator introduced in

Listing 20.4 to sort the elements. Display the sorted elements. Use the follow-
ing statement to create the array.

GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
new Circle(6.5), new Rectangle(4, 5)};

