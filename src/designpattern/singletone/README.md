# Singleton Pattern (singletone)

## Intent
클래스의 인스턴스를 오직 하나만 생성하고,
전역 접근점을 제공한다.

## This package focuses on
`ChocolateBoiler` 예제로 “상태를 공유하는 단일 자원”을 관리한다.
여러 곳에서 보일러를 만들면 충돌/오작동 가능성이 있으므로,
단일 인스턴스가 적합하다.

## Participants (by class)
- Singleton candidate: `ChocolateBoiler`
- Example usage: `ChocolateController`
- Additional example class: `Singleton`

## How to run
- 이 패키지에는 보통 `ChocolateController` 또는 예제 main을 통해 확인합니다.
(실행 진입 클래스가 있다면 그 클래스를 실행)

## Notes / Improvement
- 폴더명 `singletone`은 일반적으로 `singleton` 표기가 표준입니다.
- 멀티스레드 환경까지 고려한다면
  - eager initialization / synchronized / double-checked locking 등을 검토하세요.
