//순차 탐색
//상근이의 카드 개수, 가지고 있는 카드 번호, 비교해야 할 카드 개수, 카드 번호 입력
let input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

let N = Number(input[0]); //상근이의 카드 개수
let ownedCard = new Set(input[1].split(' ').map(Number)); //가지고 있는 카드 번호 일반 배열을 사용하면 시간 초과로 set을 사용
let M = Number(input[2]); //비교 카드 개수
let card = input[3].split(' ').map(Number); //비교해야 할 카드 번호

let arr = []; //카드 비교 후 확인을 위한 배열

//반복문을 통해 카드 번호와 비교. 상근이가 카드를 가지고 있다면 arr에 1을 넣어줌
for(let i = 0; i < M; i ++) {
    if(ownedCard.has(card[i])) arr.push(1)
    else arr.push(0)
}

console.log(arr.join(' '));