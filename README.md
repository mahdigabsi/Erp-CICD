# Pipeline CI/CD pour l'ERP

Ce dépôt contient la configuration du pipeline CI/CD pour notre application ERP en utilisant Jenkins, Docker Compose, Spring Boot, MySQL, et d'autres outils.

## Intégration Continue (CI)

- **Commit du Code**: Les développeurs poussent le code dans le dépôt Git.
- **Build et Tests**: Jenkins compile le code, exécute les tests, et produit des artefacts de build.
- **Tests Unitaires avec Mockito**: Utilisation de Mockito pour les tests unitaires.
- **JaCoCo**: Utilisation de JaCoCo pour mesurer la couverture de code.
- **Docker**: Construction et push des images Docker vers AWS ECR.

## Livraison/Déploiement Continu (CD)

- **Déploiement sur AWS ECS/EKS**: Utilisation d'AWS ECS ou EKS pour déployer les images Docker.
- **Stratégies de Déploiement**: Mise en place de stratégies comme Blue/Green, Rolling, ou Canary.

## Infrastructure as Code (IaC)

- **Terraform**: Provisionnement des ressources AWS (EC2, VPC, RDS).
- **Ansible**: Déploiement et configuration de l'application Spring Boot.

## Monitoring et Logging

- **Prometheus**: Collecte des métriques de performance.
- **Grafana**: Visualisation des métriques et création de tableaux de bord.

## Analyse de Code

- **SonarQube**: Analyse statique du code pour identifier les problèmes de qualité.

## Retour Continu

- **Notifications Jenkins**: Envoi de notifications aux développeurs en cas de succès ou d'échec des builds.
- **Optimisation**: Analyse des métriques pour améliorer le processus CI/CD.

---

# Projet de Fin d'Études (PFE)

Ce dépôt contient le code source de mon projet de fin d'études:

- **/src**: Contient le code source de l'application Spring Boot.
- **/docker-compose.yml**: Fichier Docker Compose pour définir les services nécessaires à l'application.
- **/Jenkinsfile**: Fichier Jenkinsfile pour définir le pipeline CI/CD.
- **/terraform**: Contient les fichiers de configuration Terraform pour le provisionnement des ressources AWS.
- **/ansible**: Contient les playbooks Ansible pour le déploiement et la configuration de l'application.
- **/prometheus**: Contient les fichiers de configuration Prometheus pour la collecte des métriques.
- **/grafana**: Contient les fichiers de configuration Grafana pour la visualisation des métriques.

Pour plus de détails sur la configuration du pipeline CI/CD, veuillez consulter le fichier Jenkinsfile et les autres fichiers de configuration du projet.
