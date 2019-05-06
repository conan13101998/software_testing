# Automated Accessibility Testing Tool (AATT)

## 1. Introduction Of AATT

AATT tests web applications regarding conformance to the Web Content Accessibility Guidelines (WCAG) 2.0. Find a list of the WCAG 2.0 rules checked by HTMLCS Engine on the HTML CodeSniffer WCAG Standard Summary page and Chrome Engine on the Google Chrome Developer Audit rules. AATT provides an accessibility API and custom web application for HTML CodeSniffer, Axe and Chrome developer tool. Using the AATT web application, you can configure test server configurations inside the firewall, and test individual pages.

AATT includes HTML CodeSniffer, Axe and Chrome developer tool with Express and PhantomJS, which runs on Node.

## 2. Setup And Config

1. NodeJS from [http://nodejs.org](http://nodejs.org)
2. GIT from [http://git-scm.com/downloads](http://git-scm.com/downloads)

* git clone https://github.com/paypal/AATT.git
* cd AATT
* sudo npm install
* git submodule init
* git submodule update
* DEBUG=AATT* http_port=3000 node app.js

## 3. Demo Test Websites [http://hoclieu.sachmem.vn](http://hoclieu.sachmem.vn)

Go: [http://localhost:3000](http://localhost:3000)

1. At page URL, enter: [http://hoclieu.sachmem.vn](http://hoclieu.sachmem.vn)
2. Choose one in Axe|Chrome|HTML Code Sniffer
3. Click Test Page

## 4. Youtube Tutorial

[https://www.youtube.com/watch?v=D2ZmnQ_EQMY&t=215s](https://www.youtube.com/watch?v=D2ZmnQ_EQMY&t=215s) - Automated Accessibility Testing Tool (AATT) | Team 2
