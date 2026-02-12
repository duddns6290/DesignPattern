# Iterator Pattern (iterator)

## Intent
컬렉션의 내부 구조를 노출하지 않고 요소를 순차 접근할 수 있게 한다.

## Problem
메뉴가 서로 다른 자료구조로 저장될 수 있다.
- `PancakeHouseMenu`
- `DinerMenu`
각각의 내부 저장 방식이 다르면, `Waitress`가 메뉴마다 접근 방식을 알아야 해서 결합이 커진다.

## Solution in this package
각 메뉴는 `Iterator`를 제공하고,
클라이언트(`Waitress`)는 `Iterator`만 사용해 순회한다.
- `DinerMenuIterator`
- `PancakeHouseMenuIterator`

## Participants (by class)
- Iterator: `Iterator`
- ConcreteIterator: `DinerMenuIterator`, `PancakeHouseMenuIterator`
- Aggregate: `Menu`
- ConcreteAggregate: `DinerMenu`, `PancakeHouseMenu`
- Item: `MenuItem`
- Client: `Waitress`
- Run: `MenuTestDrive`

## How to run
- 실행 클래스: `MenuTestDrive`

## When to use
- 컬렉션 구현이 바뀔 수 있고
- 순회 로직을 통일하고 싶을 때
