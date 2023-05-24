let input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

let inputIndex = 0; //입력 받은 배열의 index
let testCase = strToNum(input[inputIndex++])[0];
let A, B;

//테스트 케이스만큼 반복
while(testCase--) {
    let = answer = 0;
    const [numA, numB] = strToNum(input[inputIndex++]);
    A = [...strToNum(input[inputIndex++])].sort((a, b) => a - b); //N 숫자 오름차순 정렬
    B = [...strToNum(input[inputIndex++])].sort((a, b) => a - b); //M 숫자 오름차순 정렬

    for(let i of A) {
        answer += binarySearch(B, i) + 1; //인덱스가 -1로 초기화 되어 있기 때문에 +1
    }

    console.log(answer);
}


function strToNum(str) {
    //입력 받은 문자열을 int로 형변환, 배열로 리턴
    return str.split(" ").map((n) => parseInt(n));
}

function binarySearch(arr, num) {
    let index = -1; //arr배열의 수 중 num보다 크지 않은 수중에서 가장 큰 인덱스를 return
    let start = 0; //시작 인덱스
    let end = arr.length -1; //마지막 인덱스
    let middle = 0; //중간 인덱스

    while(start <= end) {
        middle = Math.floor((start + end)/2);

        if(arr[middle] < num) {
            //arr의 중간값이 num보다 작다면 답이 될 index는 중간값의 index
            //시작 index를 중간값의 다음 수로 하여 num보다 크지 않은 수중에서 제일 큰 수를 찾을 때 까지 반복
            index = middle;
            start = middle + 1;
        }

        //arr의 값이 num보다 크다면 end만 변경, index는 그대로 유지
        else end = middle -1;
    }

    return index;
}