# Abstract Factory Pattern (abstractFactory)

## Intent
서로 관련된(호환되는) 객체들의 “제품군”을 구체 클래스를 명시하지 않고 생성한다.

## Problem
Factory Method만으로는 “피자”는 지역별로 만들 수 있지만,
피자에 들어가는 **재료(Dough/Sauce/Cheese/Veggies/Clams/Pepperoni)**까지
지역별로 일관되게 바꾸려면 생성 코드가 복잡해지고, 제품군 일관성이 깨질 수 있다.

예: `ChicagoPizzaStore`에서 생성한 피자에 `ThinCrustDough`가 섞여 들어가면 컨셉이 무너짐.

## Solution in this package
`PizzaIngredientFactory`가 **재료 제품군**을 만드는 추상 팩토리 역할을 한다.
- `NYPizzaIngredientFactory`는 NY 스타일 재료(예: `ThinCrustDough`, `MarinaraSauce` 등)
- `ChicagoPizzaIngredientFactory`는 Chicago 스타일 재료(예: `ThickCrustDough`, `PlumTomatoSauce` 등)

피자들은(`CheesePizza`, `ClamPizza`, `PepperoniPizza`, `VeggiePizza`)
재료를 직접 `new`하지 않고, 팩토리를 통해 받아 조립한다.

## Participants (by class)
- AbstractFactory: `PizzaIngredientFactory`
- ConcreteFactory: `NYPizzaIngredientFactory`, `ChicagoPizzaIngredientFactory`
- AbstractProducts: `Dough`, `Sauce`, `Cheese`, `Veggies`, `Clams`, `Pepperoni`
- ConcreteProducts (examples):
  - Dough: `ThinCrustDough`, `ThickCrustDough`
  - Sauce: `MarinaraSauce`, `PlumTomatoSauce`
  - Cheese: `MozzarellaCheese`
  - Clams: `FreshClams`, `FrozenClams`
  - Pepperoni: `SlicedPepperoni`
  - Veggies: `Mushroom`, `Olive` 등
- Client(조립자): `CheesePizza`, `ClamPizza`, `PepperoniPizza`, `VeggiePizza`
- Store side (creator 흐름): `PizzaStore`, `NYPizzaStore`, `ChicagoPizzaStore`
- Run: `PizzaTestDrive`

## Key Idea
- “피자 종류 선택”은 Store가 한다 (Factory Method 느낌)
- “재료 제품군 선택”은 IngredientFactory가 한다 (Abstract Factory 핵심)
- 결과적으로 지역 스타일을 바꾸면 재료 전체가 일관되게 바뀐다.

## How to run
- 실행 클래스: `PizzaTestDrive`

## When to use
- 서로 호환되어야 하는 객체들이 한 세트로 움직이고(제품군)
- 환경/지역/테마에 따라 “세트 전체”를 교체해야 할 때

## Trade-offs
- 새로운 제품(예: `SeafoodPizza`) 추가 시, 팩토리 인터페이스와 모든 ConcreteFactory 수정이 필요할 수 있음
- 구조가 커짐(클래스 수 증가)
