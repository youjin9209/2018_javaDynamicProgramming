
Dynamic Prorgramming.
* 왜, 어떻게 풀렸는지(맞았는지) 이해하기 - 알고 넘어가기

1) 점화식 세우기 
- 구해야 하는 것 d[N]
- 왠만하면 Bottom Up 사용. 작은거부터 큰거를 풀어가는 형식으로
- 타고 올라가는 느낌 !! 
- [예제] : 11052 - 붕어빵 판매하기

2) for 문 안에서 Case 나눠지는 경우 최소 구할때
- 3가지의 Case가 있을 경우, 최대의 가지수가 나올 것부터 먼저 놓는다.
- 갱신이 되면서 최소가 되도록 해야하니까
- 최소를 구하는거니까 조건문을 가지수가 많이 나오는 순부터 !! 
- [예제] : 1463 - 1로 만들기

3) Runtime Error 조심 
- int[] d = new int[1001];

4) d[0] = 0 ?? 
- d[0] = 0 기본적으로 idx가 0 일때, 값이 0 으로 초기화가 되는데   
내가 구한 식으로부터 다시 한번 검산과정 거쳐야한다. 만약, d[0] 값이 0 이 아니라면 고쳐줘야함 
- [예제] : 9095 - 1,2,3 더하기 

5) 개수 구할 때
- d[][] 초기화 시 쓰레기값 처리 조심 ! 
- [예제] : 11057 - 오르막 수

6) 등차 수열 합 
- [예제] : 11057 - 오르막 수

7) 제한조건에 따라 Case 분류하기 
- ex) 연속으로 놓여있는 3잔을 모두 마실 수는 없다. -> 현 상황에서 포도주를 연속으로 몇잔 마셨나? 가 중요 
- [예제] : 2156 - 포도주 시식 

8) test case 가 음수만 나올 경우 !! 
- 초기 정답 값을 0으로 세팅하면 당연히 틀림 !!
- [예제] : 1912 - 연속합

9) 마지막 항을 기준으로 
- [예제] : 1699 - 제곱수의 
