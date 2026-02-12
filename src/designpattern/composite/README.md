# Composite Pattern (composite)

## Intent
부분-전체(트리) 구조를 동일한 방식으로 다루기 위해,
단일 객체와 복합 객체를 같은 인터페이스로 취급한다.

## Problem
메뉴/메뉴아이템처럼 계층 구조가 있을 때,
- 상위/하위 요소를 따로 처리하면 분기 코드가 늘고
- 트리 순회/출력이 복잡해진다.

## Solution in this package
`MenuComponent`를 공통 추상(또는 인터페이스)로 두고,
- `Menu`(Composite): 자식들을 관리(add/remove/getChild)
- `MenuItem`(Leaf): 실제 항목
`Waitress`는 `MenuComponent`만 보고 트리를 순회한다.
`CompositeIterator`로 트리 순회도 캡슐화한다.

## Participants (by class)
- Component: `MenuComponent`
- Composite: `Menu`
- Leaf: `MenuItem`
- Client: `Waitress`
- Iterator: `CompositeIterator`
- Run: `MenuTestDrive`

## How to run
- 실행 클래스: `MenuTestDrive`

## When to use
- 트리 구조가 있고(폴더/카테고리/조직도/메뉴)
- 전체/부분을 동일한 방식으로 처리하고 싶을 때

## Trade-offs
- Component가 너무 많은 기능을 갖게 되면 “Leaf에는 의미 없는 메서드”가 생길 수 있음
