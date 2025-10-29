# INF4067 - TD1 : Principes SOLID en Java

> **Université de Yaoundé I – Département d’Informatique**  
> Master 1 Génie Logiciel  
> UE : INF4067 - UML et Design Patterns  
> **Année : 2025 / 2026**  
> **Auteur : LEUDJEU WOUAPPI Beautrel Horssel** > **Matricule : 22U2079**

---

## 🎯 Objectif du TD

L’objectif de ce travail dirigé est de **mettre en pratique les 5 principes SOLID** à travers des exemples de code Java.  
Pour chaque principe, deux versions sont présentées :

1. 🧨 Une version **avant refactoring** (ne respectant pas le principe).
2. 🛠️ Une version **après refactoring**, conforme aux bonnes pratiques SOLID.

## 🧩 Les 5 principes SOLID

| Principe | Nom complet                     | Objectif principal                                                                |
| -------- | ------------------------------- | --------------------------------------------------------------------------------- |
| **S**    | Single Responsibility Principle | Une classe = une seule responsabilité                                             |
| **O**    | Open/Closed Principle           | Ouvert à l’extension, fermé à la modification                                     |
| **L**    | Liskov Substitution Principle   | Une sous-classe doit pouvoir remplacer sa superclasse sans effet indésirable      |
| **I**    | Interface Segregation Principle | Préférer plusieurs petites interfaces spécifiques à une grande interface générale |
| **D**    | Dependency Inversion Principle  | Les modules de haut niveau ne doivent pas dépendre de modules de bas niveau       |

---

## 🗂️ Structure du dépôt

Le projet est organisé de manière à bien séparer chaque principe et les deux versions du code (`before` et `after`).

INF4067_TD1_SOLID/
│
├── SRP/ # Single Responsibility Principle
│ ├── before/ # Code violant le SRP
│ └── after/ # Code refactoré respectant le SRP
│
├── OCP/ # Open Closed Principle
│ ├── before/ # Code violant l'OCP
│ └── after/ # Code refactoré respectant l'OCP
│
├── LSP/ # Liskov Substitution Principle
│ ├── before/ # Code violant le LSP
│ └── after/ # Code refactoré respectant le LSP
│
├── ISP/ # Interface Segregation Principle
│ ├── before/ # Code violant l'ISP
│ └── after/ # Code refactoré respectant l'ISP
│
├── DIP/ # Dependency Inversion Principle
│ ├── before/ # Code violant le DIP
│ └── after/ # Code refactoré respectant le DIP
│
├── README.md # Présent document
