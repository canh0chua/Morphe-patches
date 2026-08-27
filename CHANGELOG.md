## [1.3.0](https://github.com/canh0chua/Morphe-patches/compare/v1.2.2...v1.3.0) (2026-08-27)

### ✨ New Features

* add Remove Ads, Remove ChatGPT, Remove AI News patches for Viber ([831f8c9](https://github.com/canh0chua/Morphe-patches/commit/831f8c9bbedf99dbef850eb11a1a86b2bb32042d))

# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- **Remove Ads** patch (`com.viber.voip`) — forces `ViberPlusSettingsState.isAdsFree()` to return true
- **Remove ChatGPT** patch (`com.viber.voip`) — short-circuits the URL scheme handler so ChatGptLoginActivity can never launch
- **Remove AI News** patch (`com.viber.voip`) — makes the AI News Brief launcher a no-op

### Changed
- All 4 patches verified against Viber 28.6.2.0 via smali reverse-engineering

## [1.2.2] - 2026-08-27

### 🐛 Bug Fixes

* remove 4 unverified patches; keep only Secondary Viber Device ([6c35e28](https://github.com/canh0chua/Morphe-patches/commit/6c35e28f3e41eb01d0fb9da14bc9734e464153ac))

## [1.2.1] - 2026-08-27

### Changed
- Removed Enable Local Backup patch (insufficient without resource XML patching)

## [1.2.0] - 2026-08-27

### Added
- Remove Ads, Remove ChatGPT, Remove AI News, Remove Viber Pay patches (experimental)
- Secondary Viber Device patch

## [1.1.0] - 2026-08-27

### Added
- Remove Ads, Remove ChatGPT, Remove AI News, Remove Viber Pay patches
- Secondary Viber Device patch

## [1.0.0] - 2026-08-26

### Added
- Project scaffold from MorpheApp/morphe-patches-template
- GitHub Actions CI/CD with semantic-release
- Viber tablet spoof patch (experimental)

[1.2.2]: https://github.com/canh0chua/Morphe-patches/releases/tag/v1.2.2
[1.2.1]: https://github.com/canh0chua/Morphe-patches/releases/tag/v1.2.1
[1.2.0]: https://github.com/canh0chua/Morphe-patches/releases/tag/v1.2.0
[1.1.0]: https://github.com/canh0chua/Morphe-patches/releases/tag/v1.1.0
[1.0.0]: https://github.com/canh0chua/Morphe-patches/releases/tag/v1.0.0
