let board = "";
const size = 5;
for (let height = 1; height <= size; height++) {
  for (let width = 1; width <= size; width++) {
    if ((height + width) % 2 == 0) {
      board += " ";
    } else {
      board += "#";
    }
  }
  board += "\n";
}
console.log(board);
