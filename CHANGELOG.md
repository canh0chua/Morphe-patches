## 1.0.0 (2026-08-26)

### 🐛 Bug Fixes

* add package-lock.json for npm cache in release workflow ([87898c0](https://github.com/canh0chua/Morphe-patches/commit/87898c0466a06e8461ef9d5be210a2db2710da17))
* appIconColor must be 0xRRGGBB format (removed alpha channel) ([c115329](https://github.com/canh0chua/Morphe-patches/commit/c11532972255f090b6be21a8c1931544a1a56459))
* resolve Kotlin compilation errors in Constants, ViberPatch, PatchListGenerator ([ba9bb7e](https://github.com/canh0chua/Morphe-patches/commit/ba9bb7ec87b20d847e11c4b7a89d3d241d4f0341))

### ✨ New Features

* add Viber tablet spoof patch ([7186b81](https://github.com/canh0chua/Morphe-patches/commit/7186b81e70861389e867d37150d226743cf45329))

# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial project setup based on Morphe patches template
- **Secondary Viber Device** patch (`com.viber.voip`)
  - Forces device detection as tablet (smallestScreenWidthDp >= 600)
  - Enables "Link as secondary device" flow for SIM-free activation

## [1.0.0] - 2026-08-26

### Added
- Project scaffold from MorpheApp/morphe-patches-template
- GitHub Actions CI/CD with semantic-release
- Viber tablet spoof patch (experimental)

[Unreleased]: https://github.com/canh0chua/morphe-patches/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/canh0chua/morphe-patches/releases/tag/v1.0.0
