### Spring Boot Prometheus & Grafana Dashboard, Alert Configuration

### Agenda:
1. What is grafana?
2. What is the benefit of using grafana?
3. Setting up grafana from scratch

Grafana is an open-source platform for monitoring and observability that allows you to visualize, analyze, and alert on metrics and logs from a wide variety of data sources. It provides a powerful and flexible dashboard system that can be used to create interactive and dynamic visualizations of your data.

### Key Features of Grafana

`Data Source Integration`: Grafana supports a wide range of data sources, including Prometheus, InfluxDB, Graphite, Elasticsearch, AWS CloudWatch, Google Cloud Monitoring, and many more. It allows you to query and visualize data from these sources seamlessly.

`Dashboards`: You can create and share dashboards to visualize your data in various forms, such as graphs, heatmaps, tables, and more. Dashboards are highly customizable, allowing you to tailor them to your specific needs.

`Panels`: Grafana dashboards consist of panels, each representing a part of the visualization, such as a graph, table, or text. Panels can be configured to display data in the way that best suits your requirements.

`Alerting`: Grafana has a built-in alerting system that lets you define alert rules for your data. Alerts can be sent via various channels, including email, Slack, PagerDuty, and others, ensuring you are notified when certain conditions are met.

`Annotations`: You can add annotations to your graphs to provide additional context for specific data points or events. This is useful for correlating visual data with real-world events.

`Templating`: Grafana supports templates, which allows you to create reusable and dynamic dashboards. This feature lets you use variables to change data sources or metric queries dynamically.

`Plugins`: Grafana's plugin architecture allows for extensive customization. You can install various plugins to add new panels, data sources, and applications to extend Grafana's functionality.

Authentication and Authorization: Grafana supports various authentication methods, including OAuth, LDAP, and SAML, as well as fine-grained access control to manage permissions for different users and teams.

### Use Cases for Grafana

`Infrastructure Monitoring`: Visualize and monitor the performance and health of your servers, databases, and other infrastructure components.

`Application Performance Monitoring (APM)`: Track application metrics, such as response times, error rates, and resource usage.

`Business Intelligence`: Create dashboards to analyze business metrics, such as sales data, customer behavior, and financial performance.

`DevOps and CI/CD`: Monitor the performance of your continuous integration and continuous deployment pipelines, including build times, test results, and deployment statuses.

Grafana is widely used in conjunction with Prometheus, which is a popular monitoring and alerting toolkit, to provide a complete solution for metric collection, visualization, and alerting.

![image](https://github.com/BodduSatya/spring-boot-monitoring-prometheous-grafana/assets/24984593/b738e0ca-f013-4fe0-a89c-3623b7286de7)

1.	Helps us to monitor application and server health.
2.	Helps us with customized alert notification 

![image](https://github.com/BodduSatya/spring-boot-monitoring-prometheous-grafana/assets/24984593/0995efef-97a1-4d79-82be-7cf6d595625d)


### Prometheus:
Download Prometheus server
1) https://prometheus.io/download/

2) extract zip folder ( prometheus-xx.xx.xx.windows-amd64 )

3) open prometheus.yml in text editor make following configurations

```
- job_name: 'spring-actuator'
    metrics_path: '/actuator/prometheus'
    scrape_interval: 5s
    static_configs :
    - targets : ['localhost:8888']
```

4) Start Promethous server , by opening promtool.exe file.

5) http://localhost:9090 for Prometheous different metrics


### Grafana:

1 ) Download Grafana & Extract
https://grafana.com/grafana/download?platform=windows

2) go to bin and run grfana-server.exe

3 ) Http://localhost:3000/

```
Username : admin
Password: admin
```

4) setup Grafana datasource

5) download predefined dashboard template json
https://grafana.com/grafana/dashboards/12900-springboot-apm-dashboard/

import above json & select prometheous as datasource


6) Configure Alerts:

Open Grafana/conf/defaults.ini

Configure following properties

```
enabled = true
host = smtp.gmail.com:465
user =
password =
```

•	Restart the grafana server

•	In Grafana dashboard go to alerting tab


![image](https://github.com/BodduSatya/spring-boot-monitoring-prometheous-grafana/assets/24984593/d32561f1-9c02-43ea-b4ed-d47548467b0e)

