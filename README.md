<h1 align="center">Welcome to Sorting Out Sorting ‘‹</h1>

## What project is it?

> This is Sorting Out Sorting, a project I did in the third semester of college <a href="https://www.sait.ca/programs-and-courses/diplomas/information-technology" target='_blank'>(SAIT)</a>.

## What is the purpose of the project?

> This is the application driver for the Complexity and Sorting. There are six sorting algorithms that
> <a href="https://en.wikipedia.org/wiki/Bubble_sort" target='_blank'>bubble</a>,
> <a href="https://en.wikipedia.org/wiki/Insertion_sort" target='_blank'>insertion</a>,
> <a href="https://en.wikipedia.org/wiki/Selection_sort" target='_blank'>selection</a>,
> <a href="https://en.wikipedia.org/wiki/Merge_sort" target='_blank'>merge</a>,
> <a href="https://en.wikipedia.org/wiki/Quicksort" target='_blank'> quick</a>
> and <a href="https://en.wikipedia.org/wiki/Shellsort" target='_blank'>shell</a>
> sorting. It sorts shapes by three compare types (height, volume and base area) from the largest to smallest (descending order).

## Languages

<p align="left"> <a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://git-scm.com/" target="_blank"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> </p>

## How to run the program

> 1.  Run Command Prompt (CMD) on Windows or Terminal on macOS/Linux
> 2.  Change directory which includes the sort.jar file.
> 3.  Place txt file to be sorted in the same directory
> 4.  Type in the command lines with arguments like below.

```sh
java -jar sort.jar -s[sort alorythm] -t[compare type] -f[file name]
```

> Sort alorithm parameters (-s)

| Alorithm  | Parameter |
| --------- | :-------: |
| Bubble    |     b     |
| Selection |     s     |
| Insertion |     i     |
| Merge     |     m     |
| Quick     |     q     |
| Shell     |     z     |

<br/>

> Shape parameters (-t)

| Compare Type | Parameter |
| ------------ | :-------: |
| Volume       |     v     |
| Hieght       |     h     |
| Area         |     a     |

<br/>

## Testing

> Sort the file 'polyfor1.txt' in order of height using bubble sort. and print the first and last value and every thousandth value in between.

```sh
java -jar sort.jar -sB -th -fpolyfor1.txt
```

Testing of polyfor1.txt

```
20237 Cylinder 12595.147 650.338 Cone 28437.601 17222.616 Cone 8666.584 97.157 Cone 17869.86 37213.418 Cylinder 39349.549 28586.858 Cylinder 15259.053 19041.67 Pyramid 13081.024 12232.336 TriangularPrism 24471.507 3675.148 Cone 20305.605 8589.581 TriangularPrism 12686.18 2202.658 PentagonalPrism 7508.946 20864.971 Pyramid 34651.313 14280.906 OctagonalPrism 7954.529 30220.74 Pyramid 8012.237 4929.475 SquarePrism 1461.724 6896.06 TriangularPrism 22074.92 1351.138 TriangularPrism 25559.624 1508.279 Cone 31456.952 8487.446 PentagonalPrism 3304.163 7732.99 Cone 19468.874 29743.004 SquarePrism 20869.639 37559.338 SquarePrism 10365.858 20890.399 Pyramid 24509.115 38329.798 OctagonalPrism 18289.022 35640.322 Cone 37285.175 1528.21 OctagonalPrism 24128.955 37642.064 .....
```

Types of Shape in polyfor1.txt

| Shape          | Description                                                                                                                                                                                     | Example                                             |
| -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :-------------------------------------------------- |
| Cylinder, Cone | followed by a double value representing the height and another double value representing radius.                                                                                                | Cylinder 9431.453 4450.123 / Cone 674.2435 652.1534 |
| Pyramid        | followed by a double value representing the height and another double value representing edge length.                                                                                           | Pyramid 6247.53 2923.456                            |
| Prisms         | specified by the type of base polygon (SquarePrism, TrianglarPrism, PentagonalPrism, OctagonalPrism), a double value representing the height and another double value representing edge length. | SquarePrism 8945.234 3745.334                       |

<br/>

> Result of testing polyfor1.txt

![ResultExample](https://github.com/Jaeyoung-Kim-Dev/Sorting-Out-Sorting/blob/main/img/exampleResult.jpg?raw=true)

## Author

‘¤ **Jaeyoung Kim**

- Website: https://www.jaeyoungkim.ca/
- Github: [@jaeyoung-kim-dev](https://github.com/jaeyoung-kim-dev)
- LinkedIn: [@jaeyoung-kim-dev](https://linkedin.com/in/https://www.linkedin.com/in/jaeyoung-kim-dev/)
