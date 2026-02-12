# Command Pattern (command)

## Intent
요청(행동)을 객체로 캡슐화하여,
요청자(Invoker)와 수행자(Receiver)를 분리한다.

## Problem
버튼이 직접 `Lamp`나 `Alarm`을 제어하면,
- 버튼이 구체 장치에 강하게 결합되고
- 장치가 늘어날수록 버튼 코드가 변경되며
- 같은 버튼을 재사용하기 어렵다.

## Solution in this package
`Button`(Invoker)은 `Command`만 호출한다.
실제 동작은 `LampOnCommand`, `AlarmOnCommand`가 담당하고
이 Command들은 각각 `Lamp`, `Alarm`(Receiver)을 호출한다.

## Participants (by class)
- Command: `Command`
- ConcreteCommand: `LampOnCommand`, `AlarmOnCommand`
- Receiver: `Lamp`, `Alarm`
- Invoker: `Button`
- Client/Run: `TestDrive`

## Key Idea
- `Button`은 “무엇을 켜는지” 몰라도 된다.
- Command를 바꾸면 버튼의 동작이 바뀐다(조합/설정으로 확장).

## How to run
- 실행 클래스: `TestDrive`

## When to use
- UI 버튼/메뉴/단축키 같은 “요청자”와 실제 로직을 분리하고 싶을 때
- 나중에 Undo/Redo, Macro(명령 목록 실행) 같은 확장 가능성이 있을 때
