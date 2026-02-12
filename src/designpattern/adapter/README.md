# Adapter Pattern (adapter)

## Intent
호환되지 않는 인터페이스를 변환하여 함께 동작하게 한다.

## Problem
클라이언트는 `Duck`(Target) 타입을 기대하지만,
기존 구현체로 `Turkey`(Adaptee)만 있을 때 직접 사용할 수 없다.

## Solution in this package
`TurkeyAdapter`가 `Duck`을 구현(Target을 만족)하고,
내부에 `Turkey`를 감싸서(Composition) `Turkey`의 동작을 `Duck`처럼 보이게 만든다.

## Participants (by class)
- Target: `Duck`
- ConcreteTarget: `MallardDuck`
- Adaptee: `Turkey`
- ConcreteAdaptee: `WildTurkey`
- Adapter: `TurkeyAdapter`
- Client/Run: `DuckTestDrive`

## Key Idea
- 기존 코드(`WildTurkey`)를 수정하지 않고도
- 필요한 인터페이스(`Duck`)에 맞춰 재사용 가능

## How to run
- 실행 클래스: `DuckTestDrive`

## When to use
- 이미 검증된(혹은 외부 라이브러리) 클래스를 그대로 두고
- 우리 시스템의 인터페이스에 끼워 맞춰야 할 때
