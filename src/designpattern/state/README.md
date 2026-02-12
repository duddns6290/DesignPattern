# State Pattern (state)

## Intent
객체의 내부 상태에 따라 행동이 달라질 때,
상태를 클래스로 분리하여 조건문을 제거한다.

## Problem
자판기(`GumballMachine`)가 가진 상태가 늘어날수록
`if/switch` 기반의 상태 분기는 커지고 유지보수가 어려워진다.

예:
- 동전 없음
- 동전 있음
- 판매 중
- 품절
- 당첨(보너스)

## Solution in this package
`State` 인터페이스를 만들고 상태별 클래스를 분리한다.
`GumballMachine`(Context)은 현재 상태 객체를 참조하며,
동작을 상태에 위임한다.

## Participants (by class)
- Context: `GumballMachine`
- State interface: `State`
- ConcreteState:
  - `NoQuarterState`
  - `HasQuarterState`
  - `SoldState`
  - `SoldOutState`
  - `WinnerState`
- Run: `GumballMachineTestDrive`

## Key Idea
- “상태에 따른 행동”을 `GumballMachine`이 아니라 각 State가 책임진다.
- 새로운 상태 추가가 기존 코드 변경을 최소화한다(OCP).

## How to run
- 실행 클래스: `GumballMachineTestDrive`

## When to use
- 상태가 많고 전이가 복잡해질수록 효과가 커진다
- 조건문 폭발을 클래스 구조로 치환하고 싶을 때
