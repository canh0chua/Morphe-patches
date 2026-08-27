# 👋🧩 canh0chua Morphe Patches

Personal patches for Viber and other apps.

This repository contains patches for Viber that remove ads, ChatGPT, AI News, and Viber Pay.

### How to use these patches

Click here to add these patches to Morphe: https://morphe.software/add-source?github=canh0chua/morphe-patches

## 🩹 Patches list

| App | Name | Description |
|---|---|---|
| Viber | Remove Ads | Disables all ad SDKs (AdMob, Facebook, Vungle, AppHarbr) in Viber. |
| Viber | Remove ChatGPT | Disables the ChatGPT integration and removes the ChatGPT tab from Viber. |
| Viber | Remove AI News | Disables the AI News Brief feature and removes the AI News tab from Viber. |
| Viber | Remove Viber Pay | Disables the Viber Pay feature and removes the payment tab from Viber. |
| Viber | Secondary Viber Device | Forces Viber to detect the device as a tablet, enabling the "Link as secondary device" flow. |

<!-- PATCHES_START EXPANDED -->

<!-- Do not modify this section by hand. The patch list is generated when release.yml creates a new release.
     
     If you wish for the patches list to be collapsed, then remove the word 'EXPANDED' from the comment tag above.

     If you wish to manually keep this list updated then remove the PATCHES_START and PATCHES_END 
     comment blocks entirely. -->

<!-- PATCHES_END -->

## 🧑‍💻 Development

- **All changes go to the `dev` branch.** Merge `dev` → `main` (no squash) for stable releases.
- Build locally: `./gradlew :patches:buildAndroid` → output at `patches/build/libs/patches-*.mpp`
- Test with [Morphe Desktop](https://github.com/MorpheApp/morphe-desktop)
- Use [semantic commits](https://kapeli.com/cheat_sheets/Semantic_Commits.docset/Contents/Resources/Documents/index):
  - `feat:` — new patch or feature → minor version bump → pre-release
  - `fix:` — bug fix → patch version bump → pre-release
  - `chore:` — maintenance → no release
- Pre-releases are tagged automatically on `dev`; stable releases on `main`
- **Never manually edit generated files** (`CHANGELOG.md`, `patches-list.json`, `patches-bundle.json`) — `release.yml` handles everything
- **Never force-push** semantic release commits; create a new `fix:`/`feat:` commit instead

## 🤓 Tips

- See the [patcher documentation](https://github.com/MorpheApp/morphe-patcher/blob/main/docs/1_patcher_intro.md) for more examples of creating patches and fingerprints
- The `release.yml` and `.releaserc` already handle the full release pipeline; modify those instead of writing new scripts
- To verify: `./gradlew :patches:buildAndroid`, then patch a Viber APK with Morphe Desktop and confirm the desired behavior

## 📜 License

canh0chua Patches are licensed under the [GNU General Public License v3.0](LICENSE)