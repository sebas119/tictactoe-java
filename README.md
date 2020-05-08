# TicTacToe challenge

![](/images/tic.gif)

## Challenge

<p>Today, you will implement the game Tic Tac Toe.</p>

<p>Easy? Sure, but did you already developed it in SQL? or Cobol?</p>

<p>Also, for each version of Tic Tac Toe, you will have to write an “How to write a Tic Tac Toe in XXX?” post.</p>

<p>All these “How to” must be hosted in a Github page or in a Blog platform (WordPress, Jekyll, Drupal, etc.) that you will administrated per campus.</p>

## You will be evaluated on
<ul>
    <li>To have a Blog platform OR Github pages live! (to submit by group before midnight on the first task)</li>
    <li>Each group of your campus will have the same score</li>
    <li>The quality of your “How to” posts:</li>
        <ul>
            <li>Presentation of the language</li>
            <li>Algorithm put in place</li>
            <li>User(s) flow to play</li>
            <li>Piece of code related to the algorithm or flow</li>
            <li>Screenshots of the game</li>
            <li>(optional) a “ready to go” environment to play with the Tic Tac Toe - like a Docker container for example.</li>
        </ul>
</ul>

## How to run this project on docker

```
docker build -t java7 .
docker run --rm -it java7
```

## Run the project every time

```
./run.sh
```

0 --> Empty
1 --> X
2 --> O
