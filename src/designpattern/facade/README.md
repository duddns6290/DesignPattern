# Facade Pattern (facade)

## Intent
복잡한 서브시스템을 단순한 인터페이스로 감싸,
클라이언트가 쉽게 사용할 수 있게 한다.

## Problem
홈시어터를 켜려면 여러 장치를 특정 순서로 제어해야 한다.
`Amplifier`, `DvdPlayer`, `Projector`, `Screen`, `TheaterLights`, `PopcornPopper`, `Tuner`, `CDPlayer`...
클라이언트가 이걸 전부 알면 결합도가 급격히 올라간다.

## Solution in this package
`HomeTheaterFacade`가 하나의 진입점이 되어,
“영화 보기/종료” 같은 고수준 작업을 제공한다.
클라이언트는 파사드만 호출하면 된다.

## Participants (by class)
- Facade: `HomeTheaterFacade`
- Subsystems: `Amplifier`, `DvdPlayer`, `CDPlayer`, `Tuner`, `Projector`, `Screen`, `TheaterLights`, `PopcornPopper`
- Run: `HomeTheaterTestDrive`

## How to run
- 실행 클래스: `HomeTheaterTestDrive`

## When to use
- 외부에 노출되는 API를 단순화하고 싶을 때
- 서브시스템이 복잡하고 사용 순서/규칙이 있을 때
