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