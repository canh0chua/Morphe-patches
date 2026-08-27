## [1.2.1](https://github.com/canh0chua/Morphe-patches/compare/v1.2.0...v1.2.1) (2026-08-27)

### 🐛 Bug Fixes

* remove Enable Local Backup patch ([7f29d8b](https://github.com/canh0chua/Morphe-patches/commit/7f29d8b70535eb9d33983268e91d6e2a23ec6f1c))

## [1.2.0](https://github.com/canh0chua/Morphe-patches/compare/v1.1.0...v1.2.0) (2026-08-27)

### ✨ New Features

* add Enable Local Backup patch ([19c8b70](https://github.com/canh0chua/Morphe-patches/commit/19c8b70f9df66da4715e118cee29fddab6d1bcdd))

## [1.1.0](https://github.com/canh0chua/Morphe-patches/compare/v1.0.0...v1.1.0) (2026-08-27)

### 🐛 Bug Fixes

* add missing imports (addInstructions, Opcode) to new Viber patches ([05e04a1](https://github.com/canh0chua/Morphe-patches/commit/05e04a148d7b332f6ea4ccd89331108498138676))

### ✨ New Features

* add Remove Ads, Remove ChatGPT, Remove AI News, Remove Viber Pay patches ([12ec30f](https://github.com/canh0chua/Morphe-patches/commit/12ec30fde6f803288622b912d9459be5ebf770c8))
* add Remove Ads, Remove ChatGPT, Remove AI News, Remove Viber Pay patches ([910488b](https://github.com/canh0chua/Morphe-patches/commit/910488b2412c4e07beae4057f1a7f3835c0b662c))

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
- **Remove Ads** patch (`com.viber.voip`)
  - Disables Google AdMob, Facebook Audience Network, Vungle, and AppHarbr SDKs
- **Remove ChatGPT** patch (`com.viber.voip`)
  - Hides the ChatGPT tab and disables the ChatGPT login flow
- **Remove AI News** patch (`com.viber.voip`)
  - Hides the AI News Brief tab and disables the topics selection flow
- **Remove Viber Pay** patch (`com.viber.voip`)
  - Hides the Viber Pay tab and disables the standalone payment flow
- **Secondary Viber Device** patch (`com.viber.voip`)
  - Forces device detection as tablet (smallestScreenWidthDp >= 600)
  - Enables "Link as secondary device" flow for SIM-free activation

## [1.0.0] - 2026-08-26

### Added
- Project scaffold from MorpheApp/morphe-patches-template
- GitHub Actions CI/CD with semantic-release
- Viber tablet spoof patch (experimental)

[Unreleased]: https://github.com/canh0chua/Morphe-patches/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/canh0chua/Morphe-patches/releases/tag/v1.0.0
