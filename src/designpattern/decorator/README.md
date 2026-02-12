# Decorator Pattern (decorator)

## Intent
객체에 동적으로 책임(기능)을 추가한다.
상속 대신 조합을 사용해 클래스 폭발을 방지한다.

## Problem
음료에 옵션(모카/휘핑/두유 등)을 조합해야 하는데,
상속으로 조합을 표현하면 경우의 수만큼 클래스가 늘어난다.

## Solution in this package
- 기본 구성요소: `Beverage`
- 데코레이터 공통: `CondimentDecorator` (Beverage를 감싼다)
- 구체 음료: `Espresso`, `DarkRoast`, `HouseBlend`
- 구체 데코레이터: `Mocha`, `Soy`, `Whip`

최종 가격/설명은 “감싸진 객체”를 따라가며 누적된다.

## Participants (by class)
- Component: `Beverage`
- ConcreteComponent: `Espresso`, `DarkRoast`, `HouseBlend`
- Decorator: `CondimentDecorator`
- ConcreteDecorator: `Mocha`, `Soy`, `Whip`
- Run: `Main`

## How to run
- 실행 클래스: `Main`

## When to use
- 기능 조합이 많고 런타임에 유연하게 붙였다 떼고 싶을 때
- 상속으로 조합을 표현하면 클래스가 폭증할 때
