# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial project setup based on Morphe patches template
- Viber tablet spoof patch (`com.viber.voip`)
  - Forces device detection as tablet (smallestScreenWidthDp >= 600)
  - Enables "Link as secondary device" flow for SIM-free activation

## [1.0.0] - 2026-08-26

### Added
- Project scaffold from MorpheApp/morphe-patches-template
- GitHub Actions CI/CD with semantic-release
- Viber tablet spoof patch (experimental)

[Unreleased]: https://github.com/canh0chua/morphe-patches/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/canh0chua/morphe-patches/releases/tag/v1.0.0