# Template Method Pattern (template)

## Intent
알고리즘의 골격(흐름)은 상위 클래스에서 정의하고,
일부 단계는 하위 클래스에서 구현한다.

## Problem
커피/차 만들기처럼 “흐름은 동일하지만 세부 단계가 다른” 작업이 많을 때,
복붙 코드가 늘고 변경이 어려워진다.

## Solution in this package
`CaffeineBeverage`가 템플릿 메서드를 제공한다.
- 공통 흐름: 끓이기 → 우리기 → 컵에 따르기 → 첨가물
- 세부 단계는 `Coffee`, `Tea`가 구현한다.

또한 Hook 버전:
- `CoffeeWithHook`, `TeaWithHook`
Hook(조건부 오버라이드)로 사용자의 선택에 따라 단계를 건너뛸 수 있다.

## Participants (by class)
- AbstractClass: `CaffeineBeverage`
- ConcreteClass: `Coffee`, `Tea`
- Hook examples: `CoffeeWithHook`, `TeaWithHook`
- Run: `BeverageTestDrive`

## How to run
- 실행 클래스: `BeverageTestDrive`

## When to use
- 처리 흐름을 통제하고(골격 고정)
- 변하는 부분만 확장하고 싶을 때
