# Searching & Sorting

This problem set focuses on a number of concepts, all through the lens of searching and sorting algorithms. You'll be asked to implement a number of searching and sorting algorithms that handle inputs and produce outputs in the form of arrays or lists. Some of your implementations will be iterative, while others will make use of recursion.

## Getting Started

To get started, you'll need to create a [GitHub](https://github.com/) repository to store your code. After cloning my skeleton repository, you'll need to setup a remote to push your code to your repository instead of mine. Steps to accomplish this are outlined below.

### Setup

01. Login to your [GitHub](https://github.com/) account and create a new repository named `searching-and-sorting`.
02. In GitBash, navigate to your `APCSA` folder.
03. Clone my skeleton repository from [GitHub](https://github.com/). This will make a copy of my repository and store it locally.
```
git clone git@github.com:rwilson-ucvts/java-searching-and-sorting-skeleton.git
```
04. The cloning process will have created a folder named `java-searching-and-sorting-skeleton`. Rename this folder to `searching-and-sorting`.
```
mv java-searching-and-sorting-skeleton searching-and-sorting
```
05. Change directories to get into your `searching-and-sorting` folder.
```
cd searching-and-sorting
```
06. Originally, the remote will be pointing at my repository. We need to overwrite this.
```
git remote rename origin upstream
```
07. Lastly, we need to add a new remote that points at the repository you created earlier. Make sure you replace `YOUR-USERNAME` with your actual username.
```
git remote add origin git@github.com:YOUR-USERNAME/searching-and-sorting.git
```
08. Launch Eclipse and set the `Workspace` to the `APCSA` folder you created on your `Desktop`. Make sure you're using your `Workspace`, as others' will be similarly named.
09. From within the `Package Explorer` (the left-most panel), right-click and select `Import...`.
10. Select `Git > Projects from Git`, and click `Next >`.
11. Select `Existing local repository` and click `Next >`.
12. Click the `Add...` button, and then the `Browse...` button.
13. Navigate to the `APCSA` folder on your `Desktop`, click the `pset3` project folder, and click `Open`.
14. Select the checkbox next to your project and click `Finish`.
15. Now that we've imported the Git project, we can click `Next >`, `Next >`, and `Finish` once more.

You should now see a `Project` in the `Package Explorer` in Eclipse.

16. Expand the `Project` folder. You should see the `JRE System Library` folder, as well as the `src` folder.
17. Expand the `src` folder. You should see a single source file named `SearchAndSort.java`. Double-click to open it.

If you see the following starter code, then you've correctly cloned and setup your project.

## Exercises

This problem set contains 7 exercises, including your implementation of the `main` method. With the exception of the `main` method, each exercise will require you to write multiple methods. For the most part, you won't be building out new functionality. Rather, you'll be overloading methods so that the same functionality can handle inputs and ouputs of various data types.

### Exercise 0 (`main`)

This is your `main` method, which will drive your program. You'll solicit user input regarding the type of search or sort you wish to run, as well as the required inputs. Everything in this exercise will depend upon the successful completion of the subsequent exercises. Below, I've outlined what your program should accommodate, as well as an example of what a single execution might look like.

1. Prompt the user: What algorithm would you like to execute? Acceptable responses: bubble, selection, insertion, merge, linear, binary, quit (all case-insensitive).
2. Prompt the user: What type of data? Acceptable responses: integers, strings.
3. Prompt the user: How is it stored? Acceptable responses array, list.
4. Prompt the user: Enter the data. Acceptable responses: a comma-delimited list of data (i.e., 1,2,3,4,5). You should build an array or `ArrayList` from this data, based on the user's response to the previous prompt.
5. If the user chose a sorting algorithm, execute the algorithm. Remember, some algorithms require that the data be sorted first.
6. If the user chose a searching algorithm, prompt the user: What is the target value? Then, execute the algorithm.
7. All exceptions should be caught and handled gracefully.

Here's an example.

```
What algorithm would you like to execute? bubble
What type of data? integers
How is it stored? array
Enter the data. 1,9,2,8,3,7,4,6,5
Bubble sort: [1, 2, 3, 4, 5, 6, 7, 8, 9].

What algorithm would you like to execute? quit
```

### Exercise 1 (`bubble`)

Implement the bubble sort algorithm in a method called `bubble`. This method should accept a single parameter: the list of data that needs to be sorted. It should return the sorted data in the same format (i.e., data type). You'll need to overload this method to handle the various parameter and return types.

### Exercise 2 (`selection`)

Implement the selection sort algorithm in a method called `selection`. This method should accept a single parameter: the list of data that needs to be sorted. It should return the sorted data in the same format (i.e., data type). You'll need to overload this method to handle the various parameter and return types.

### Exercise 3 (`insertion`)

Implement the insertion sort algorithm in a method called `insertion`. This method should accept a single parameter: the list of data that needs to be sorted. It should return the sorted data in the same format (i.e., data type). You'll need to overload this method to handle the various parameter and return types.

### Exercise 4 (`merge`)

Implement the merge sort algorithm in a method called `merge`. This method should accept a single parameter: the list of data that needs to be sorted. It should return the sorted data in the same format (i.e., data type). You'll need to overload this method to handle the various parameter and return types. Remember, merge sort is a recursive algorithm. That means it'll call itself during the process of execution. You might also find it useful to implement a helper method to assist your `merge` method.

### Exercise 5 (`linear`)

Implement the linear search algorith in a method called `linear`. This method should accept two parameters: the list of data that needs to be searched, as well as the target value. It should return the index at which the target value was found. The if the target value was not found, the list was empty, or the list was null, return -1. You'll need to overload this method to handle the various parameter and return types.

### Exercise 6 (`binary`)

Implement the binary search algorith in a method called `binary`. This method should accept two parameters: the list of data that needs to be searched, as well as the target value. It should return the index at which the target value was found. The if the target value was not found, the list was empty, or the list was null, return -1. You'll need to overload this method to handle the various parameter and return types. Remember, the binary search algorithm requires that its data be sorted first. Call upon one of your sorting methods to do this.

## Deadline

Your Canvas submission is due at or before 11:59pm on March 4, 2019.

### Submission Requirements

All that is required for submission is the URL to your [GitHub](https://github.com/) repository for this problem set.
